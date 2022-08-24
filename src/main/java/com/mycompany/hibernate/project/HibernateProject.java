package com.mycompany.hibernate.project;

import com.mycompany.hibernate.project.entities.Car;
import com.mycompany.hibernate.project.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateProject {

    public static void main(String[] args) {
        
        System.out.println("Start application!");
        
        // Хибернэйтовская конфигурация
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Car.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        // Открываем сессию и сохраняем юзера
        Session session = sessionFactory.openSession();
        User user = new User();
        user.name = "Petr";
        user.age = 14;
        user = session.find(User.class, 1);
        session.close();
        
    }
}
