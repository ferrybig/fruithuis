/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dutchconnected.fruithuis.frames;

import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import javax.persistence.criteria.CriteriaQuery;
import javax.swing.JDialog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Crud<E> {

	private final Class<E> clazz;
	private final List<Field<?>> fields = new ArrayList<>();

	public Crud(Class<E> clazz) {
		this.clazz = clazz;
	}

	public Class<E> getClazz() {
		return clazz;
	}
	
	public Query<E> selectAll(Session s) {
		CriteriaQuery<E> createQuery = s.getSessionFactory().getCriteriaBuilder().createQuery(getClazz());
		createQuery.from(getClazz());
		return s.createQuery(createQuery);
	}

	public <T> Crud<E> addField(String name, Function<E, ? extends T> getter, BiConsumer<E, ? super T> setter, Class<T> type) {
		fields.add(new Field<>(name, getter, setter, type));
		return this;
	}

	public List<Field<?>> getFields() {
		return fields;
	}

	public TriFunction<Window, SessionFactory, E, JDialog> editAction() {
		return (a, b, c) -> new EntityEdit<>(a, b, c, this);
	}

	public BiFunction<Window, SessionFactory, JDialog> addAction() {
		return (a, b) -> new EntityAdd<>(a, b, this);
	}
	
	public BiFunction<Window, SessionFactory, JDialog> listAction() {
		return (a, b) -> new EntityList<>(a, b, this);
	}

	public class Field<T> {

		private final String name;
		private final Function<E, ? extends T> getter;
		private final BiConsumer<E, ? super T> setter;
		private final Class<T> type;

		public Field(String name, Function<E, ? extends T> getter, BiConsumer<E, ? super T> setter, Class<T> type) {
			this.name = name;
			this.getter = getter;
			this.setter = setter;
			this.type = type;
		}

		public String getName() {
			return name;
		}

		public Function<E, ? extends T> getGetter() {
			return getter;
		}

		public BiConsumer<E, ? super T> getSetter() {
			return setter;
		}

		public Class<T> getType() {
			return type;
		}

	}

}
