package com;

import com.command.Commands;
import com.util.UserInputUtil;

public class Main {
    public static void main(String[] args) {
//        EntityManager entityManager = HibernateFactoryUtil.getEntityManager();
//        entityManager.isOpen();
 //       FlyWayConfig.getInstance().migrate();
        final Commands[] values = Commands.values();
        boolean exit;

        do {
            exit = UserInputUtil.userAction(values);
        } while (!exit);
    }
}
