package security.hash.hashAlgoritm;

/**
 * 해시 알고리즘은 HashType 인터페이스를 구현하여 getHashString에서 호출하도록함
 * Created by jungpark on 2017. 10. 1..
 */
public interface HashType {

    String makeHash(String str);

}
