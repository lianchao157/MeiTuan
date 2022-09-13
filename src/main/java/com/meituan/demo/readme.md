https://www.cnblogs.com/mjbenkyo/p/12067982.html
sql  下  插入 数据循环


foreach的主要用在构建in条件中，它可以在SQL语句中进行迭代一个集合。
foreach元素的属性主要有 item，index，collection，open，separator，close。
item集合中每一个元素进行迭代时的别名，
index表示在迭代过程中，每次迭代到的位置，
open该语句以什么开始，
separator在每次进行迭代之间以什么符号作为分隔 符，
close以什么结束，
在使用foreach的时候最关键的也是最容易出错的就是collection属性，
该属性是必须指定的，但是在不同情况 下，该属性的值是不一样的，
主要有一下3种情况：
1. 如果传入的是单参数且参数类型是一个List的时候，collection属性值为list
2. 如果传入的是单参数且参数类型是一个array数组的时候，collection的属性值为array
3. 如果传入的参数是多个的时候，我们就需要把它们封装成一个Map了
————————————————
版权声明：本文为CSDN博主「zEthan」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/ethan_10/article/details/79729101


2021.9.2
spring boot  计划写查询用户信息
userLoginMapper


<foreach collection="list" item="item" open="(" close=")" separator="," index="">
    #{item.studentId}
</foreach>
解释含义：

foreach的主要用在构建in条件中，它可以在SQL语句中进行迭代一个集合。
foreach元素的属性主要有 item，index，collection，open，separator，close。
item集合中每一个元素进行迭代时的别名，
index表示在迭代过程中，每次迭代到的位置，
open该语句以什么开始，
separator在每次进行迭代之间以什么符号作为分隔 符，
close以什么结束，
在使用foreach的时候最关键的也是最容易出错的就是collection属性，
该属性是必须指定的，但是在不同情况 下，该属性的值是不一样的，
主要有一下3种情况：
1.     如果传入的是单参数且参数类型是一个List的时候，collection属性值为list
2.     如果传入的是单参数且参数类型是一个array数组的时候，collection的属性值为array
3.     如果传入的参数是多个的时候，我们就需要把它们封装成一个Map了
————————————————
版权声明：本文为CSDN博主「心似烟火」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/sz15732624895/article/details/82892283



spring boot 四大特性



cityselect.html
c城市选择代码
