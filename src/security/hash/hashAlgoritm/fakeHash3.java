package security.hash.hashAlgoritm;

/**
 * Created by jungpark on 2017. 10. 1..
 */
public class fakeHash3 implements HashType {
    @Override
    public String makeHash(String str) {

        return "makeHash in FakeHash3 = "+str;
    }
}
