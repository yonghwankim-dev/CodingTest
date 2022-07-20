package PROM_17677;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class SolutionTest {

    @Test
    void test1(){
        int answer = new Solution().solution("FRANCE", "french");

        Assert.assertEquals(16384, answer);
    }

    @Test
    void test2(){
        int answer = new Solution().solution("handshake", "shake hands");

        //Assert.assertEquals(65536, answer);
    }


}
