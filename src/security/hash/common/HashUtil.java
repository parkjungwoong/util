package security.hash.common;

import security.hash.hashAlgoritm.HashType;

/**
 * 해시값 생성 유틸
 * Created by jungpark on 2017. 10. 1..
 */
public class HashUtil {

    //공통 해시 알고리즘
    private static String hashType = "security.hash.hashAlgoritm.fakeHash3";

    /**
     * 해시알고리즘을 호출하는 부분에서 선택
     * @param clazz HashType을 구현한 해시 알고리즘 클래스
     * @param params 해시할 문자열
     * @return 해시값
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static String getHash(Class <? extends HashType> clazz, String... params) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance().makeHash(makeOneString(params));
    }

    /**
     * 공통 해시알고리즘으로 해시값 생성
     * @param params 해시할 문자열
     * @return 해시값
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static String getHash(String... params) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return ( (Class<? extends HashType>) Class.forName(hashType) ).newInstance().makeHash(makeOneString(params));
    }

    /**
     * 문자열 배열을 하나의 문자열로 반환
     * @param params 문자열 배열
     * @return 합쳐진 문자열
     */
    private static String makeOneString(String params[]){
        StringBuilder builder = new StringBuilder();

        for(String e : params){
            builder.append(e);
        }

        return builder.toString();
    }

}
