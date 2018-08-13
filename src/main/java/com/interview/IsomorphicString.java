package com.interview;

import java.util.HashMap;

/**
 * Isomorphic Strings
 * For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
 *
 * @author yang
 * @create 2018/8/1 20:09
 */
public class IsomorphicString {

  public static void main(String[] args) {
    String s="sss124";
    String t="555967";
    boolean flag = isIsomorphic(s,t);
    System.out.println(flag);
  }

  public static boolean isIsomorphic(String s,String t){
    if(s==null || t==null){
      return false;
    }
    if(s.length()!=t.length()){
      return false;
    }
    HashMap<Character,Character> map = new HashMap<Character,Character>();
    for(int i=0;i<s.length();i++){
      char c1 = s.charAt(i);
      char c2 = t.charAt(i);

      if(map.containsKey(c1)){
        if(map.get(c1)!=c2){
          return false;
        }
      }else {
        if(map.containsValue(c2)){
          return false;
        }
        map.put(c1,c2);
      }
    }
    return true;
  }

}
