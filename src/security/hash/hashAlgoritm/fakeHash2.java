package security.hash.hashAlgoritm;

/**
 * Created by jungpark on 2017. 10. 1..
 */
public class fakeHash2 implements HashType {
    @Override
    public String makeHash(String str) {

        return "makeHash in FakeHash2 = "+str;
    }
}
