package utils;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.tsmurer.shopjoin.utils.Hasher;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@WebMvcTest(value= Hasher.class)
class HashBuilderTest {

    private String senha = "1234";


    @Test
    void criacaoSenhaTest() {
        String senhaHash = Hasher.hashPassword(senha);
        assertEquals(160, senhaHash.length());
        assertNotEquals(senhaHash, senha);
    }

    @Test
    void compararCertoSenha() {
        String senhaLogin = Hasher.hashPassword(senha);
        boolean senhaCorreta = Hasher.comparePasswords(senha, senhaLogin);
        assertEquals(true, senhaCorreta);
    }

    @Test
    void compararErradaSenha() {
        String senhaLogin = Hasher.hashPassword("123");
        boolean senhaCorreta = Hasher.comparePasswords(senha, senhaLogin);
        assertEquals(false, senhaCorreta);
    }

}
