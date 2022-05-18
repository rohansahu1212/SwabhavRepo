package com.monocept.model.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.monocept.model.Actor;
import com.monocept.model.Movie;

public class MovieTest {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Actor a1 = new Actor();
		Actor a2 = new Actor();
		a1.setAid(34);
		a1.setActorName("kangana ranaut");
		a2.setAid(35);
		a2.setActorName("Akshay Kumar");

		Movie m1 = new Movie();
		Movie m2 = new Movie();
		m1.setMid(201);
		m1.setMovieName("krish");
		m2.setMid(301);
		m2.setMovieName("dhakad");

		List<Actor> actorlist = new ArrayList<Actor>();
		List<Movie> movielist = new ArrayList<Movie>();
		actorlist.add(a1);
		actorlist.add(a2);

		movielist.add(m1);
		movielist.add(m2);

		a1.setMovies(movielist);
		a2.setMovies(movielist);
		m2.setActors(actorlist);
		m1.setActors(actorlist);

		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(a1);
		session.save(a2);
		session.save(m1);
		session.save(m2);
		txn.commit();
		factory.close();
	}
}
