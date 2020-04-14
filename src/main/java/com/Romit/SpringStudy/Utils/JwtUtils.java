package com.Romit.SpringStudy.Utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;




/**
 * 此文件由 IntelliJ IDEA. 2019.3版本创建
 * \* 创建人: 李锐(Romit.Lee)
 * \* 创建日期: 2020/3/25
 * \* 创建时间: 20:11
 * \* 描述:
 * \
 * @author romitlee
 */
@Component
public class JwtUtils {


    private static final String JWT_SECRET = "MDk4ZjZiY2Q0NjIxZDM3M2NhZGU0ZTgzMjYyN2I0ZjY=";

    /**
     * token 过期时间, 单位: 秒. 这个值表示 7 天
     */
    private static final long TOKEN_EXPIRED_TIME = 7 * 24 * 60 * 60;

    /**
     * 秘钥
     */
    public static final String jwtId = "tokenId";

    /**
     * 生成jwt
     *
     * @param
     * @return
     */
    public  String createjwt(Map<String, Object> claims, Long time) {
        //指定签名的时候使用的签名算法，也就是header那部分，jjwt
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        // 已经将这部分内容封装好了。
        Date now = new Date(System.currentTimeMillis());

        SecretKey secretKey = generalKey();
        //生成JWT的时间
        long nowMillis = System.currentTimeMillis();
        //下面就是在为payload添加各种标准声明和私有声明了
        //这里其实就是new一个JwtBuilder，设置jwt的body
        JwtBuilder builder = Jwts.builder()
                .setClaims(claims)
                //如果有私有声明，一定要先设置这个自己创建的私有的声明，这个是给builder的claim赋值，一旦写在标准的声明赋值之后，就是覆盖了那些标准的声明的
                .setId(jwtId)
                //设置jti(JWT ID)：是JWT的唯一标识，根据业务需要，这个可以设置为一个不重复的值，主要用来作为一次性token,从而回避重放攻击。
                .setIssuedAt(now)
                //iat: jwt的签发时间
                .signWith(signatureAlgorithm, secretKey).setSubject("romit");

        //设置签名使用的签名算法和签名使用的秘钥
        if (time >= 0) {
            long expMillis = nowMillis + time;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
            //设置过期时间
        }
        return builder.compact();
    }

    /**
     * 验证jwt
     */
    public Claims verifyJwt(String token) {
        //签名秘钥，和生成的签名的秘钥一模一样
        SecretKey key = generalKey();
        Claims claims;
        try {
            claims = Jwts.parser()
                    //得到DefaultJwtParser
                    .setSigningKey(key)
                    //设置签名的秘钥
                    .parseClaimsJws(token).getBody();
        } catch (Exception e) {
            claims = null;
        }//设置需要解析的jwt
        System.out.println("用户id" + claims.getId());
        System.out.println("用户名" + claims.getSubject());
        System.out.println("token过期时间" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(claims.getExpiration()));
        System.out.println("用户登录时间" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(claims.getIssuedAt()));
        System.out.println("用户的角色是:"+claims.get("userId"));

        return claims;

    }




    /**
     * 由字符串生成加密key
     *
     * @return
     */
    public  SecretKey generalKey() {

        byte[] encodedKey = Base64.decodeBase64(JWT_SECRET);
        SecretKey skey = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
        return skey;
    }

    /**
     * 根据userId和openid生成token
     */
    public  String generateToken(String userId) {
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);

        return createjwt(map, TOKEN_EXPIRED_TIME);
    }
}
