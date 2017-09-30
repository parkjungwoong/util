package security.hash;

import security.hash.common.HashUtil;
import security.hash.hashAlgoritm.fakeHash1;
import security.hash.hashAlgoritm.fakeHash2;

/**
 * Created by jungpark on 2017. 10. 1..
 */
public class test {

    public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        String param1 = "one";
        String param2 = "two";
        String param3 = "three";

        String fakeHash1 = "";
        String fakeHash2 = "";
        String fakeHash3 = "";

        fakeHash1 = HashUtil.getHash(fakeHash1.class,param1,param2,param3);

        fakeHash2 = HashUtil.getHash(fakeHash2.class,param1,param2,param3);

        fakeHash3 = HashUtil.getHash(param1,param2,param3);

        System.out.println("HashUtil.getHash(fakeHash1.class,param1,param2,param3); ===> "+fakeHash1);
        System.out.println("HashUtil.getHash(fakeHash2.class,param1,param2,param3); ===> "+fakeHash2);
        System.out.println("HashUtil.getHash(param1,param2,param3); ===> "+fakeHash3);

    }

}
