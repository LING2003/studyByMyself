package study.byMyself.ObjectAPI;
//public String toString()				//返回该对象的字符串表示形式(可以看做是对象的内存地址值)
//public boolean equals(Object obj)		//比较两个对象地址值是否相等；true表示相同，false表示不相同
//protected Object clone()    			//对象克隆

/*
1. 在通过输出语句输出一个对象时，默认调用的就是toString()方法
2. 输出地址值一般没有意义，我们可以通过重写toString方法去输出对应的成员变量信息（快捷键：atl + insert ， 空白处 右键 -> Generate -> 选择toString）
3. toString方法的作用：以良好的格式，更方便的展示对象中的属性值
4. 一般情况下Jdk所提供的类都会重写Object类中的toString方法
 */
/*
1. 默认情况下equals方法比较的是对象的地址值
2. 比较对象的地址值是没有意义的，因此一般情况下我们都会重写Object类中的equals方法
 */
