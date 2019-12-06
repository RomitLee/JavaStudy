package com.Romit.SpringStudy;

import java.util.*;

/**
 * 此文件由 IntelliJ IDEA. 2019.3版本创建
 * \* 创建人: 李锐(Romit.Lee)
 * \* 创建日期: 2019/12/7
 * \* 创建时间: 3:16
 * \* 描述:  一个实现Iterable的类，可以拥有多个迭代器，其中默认实现方法iterator() 返回一个默认迭代器，
 * \
 */


/*
*Iteratable接口的实现又依赖于实现了Iterator的内部类
* (参照LinkedList中listIterator()和descendingIterator()的JDK源码)。
* 有的容器类会有多个实现Iterator接口的内部类，通过返回不同的迭代器实现不同的迭代方式。


*
*
* */
public class MutilIterator implements Iterable<String> {



    private String[] words = "May I get offers this summer.".split(" ");

    //默认的迭代器，前向遍历
    public Iterator<String> iterator() {
    //匿名内部类
        return new Iterator<String>() {
            private int index = 0;
            public boolean hasNext() {return index < words.length;}
            public String next() { return words[index++];    }

            // Not implemented throw
            public void remove() { new UnsupportedOperationException(); }
        };
    }



    //反向迭代器
    public Iterable<String> reverseIterator() {
            return new Iterable<String>() {
                @Override public Iterator<String> iterator() {
                    return new Iterator<String>() {
                        private int index = words.length - 1;
                        public boolean hasNext() {return index > -1; }
                        public String next() {return words[index--]; }
                        public void remove() { // Not implemented throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    //随机迭代器，注意这里不是创建一个新的Iterator，而是返回了一个打乱的List中的迭代器
    public Iterable<String> randomized() {
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                List<String> shuffled = new ArrayList<>(Arrays.asList(words));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
        }
    };
}


}
