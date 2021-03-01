//package com.zhibodata.gis.kfqpopulation;
//
//import com.zhibodata.gis.kfqpopulation.model.User;
//import com.zhibodata.gis.kfqpopulation.service.UserService;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.test.annotation.Commit;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = KfqpopulationApplication.class)
//@Transactional
//@EnableCaching
//@PropertySource("classpath:jdbc.properties")
//class KfqpopulationApplicationTests {
//
//    @Autowired
//    private UserService userService;
//
//    @Test
//    public void test1(){
//        User user1 = userService.getUserById("162e0ef9-8f96-4822-885f-489877a7c821");
//        System.out.println("===========");
//        System.out.println(user1);
//        User user2 = userService.getUserById("162e0ef9-8f96-4822-885f-489877a7c821");
//        System.out.println("===========");
//        System.out.println(user2);
//    }
//}
