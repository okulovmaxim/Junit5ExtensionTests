package tests;

import callbacks.TestSaver;
import models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import parameters.RandomUser;
import parameters.RandomUserResolver;

@ExtendWith({RandomUserResolver.class, TestSaver.class})
public class ExtensionTest {

    @Test
    public void testWithParam(@RandomUser User user) {
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
    }

    @Test
    public void failedTest() {
        Assertions.assertEquals(3,5);
    }
}
