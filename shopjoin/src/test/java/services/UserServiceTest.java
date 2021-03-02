package services;

import com.tsmurer.shopjoin.dtos.UserTO;

public class UserServiceTest {

    public static UserTO mockUserTO() throws Exception{
        UserTO mock = new UserTO();

        mock.setUserId(10);
        mock.setEmail("tsmurer@tsmurer.com.br");
        mock.setPassword("1234");


        return mock;
    }


}
