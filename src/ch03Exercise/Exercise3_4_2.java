package ch03Exercise;


/**
 * 
 * 2.设计一个测试类，使其实际运行来测试链队列类中各成员函数的正确性。
 */
//链队列类
import  ch03.LinkQueue;  
//测试类
public class Exercise3_4_2 {
   public static void main(String[] args) {
		LinkQueue Q = new LinkQueue();
		for (int i = 1; i <= 10; i++)
			// 初始化队列中的元素，其中元素个数为10
			Q.offer(i);
		System.out.println("队列中各元素为(队首到队尾)： ");
		Q.display();// 打印队列中元素（队首到队尾）
		System.out.println();
		if (!Q.isEmpty())
			System.out.println("队列非空！");

		System.out.println("队列的长度为： " + Q.length());// 输出队列的长度
		System.out.println("队首元素为： " + Q.peek().toString());// 输出队首元素

		System.out.println("去除队首元素后，队列中各元素为(队首到队尾)：  ");
		Q.poll();// 删除元素
		Q.display();// 打印队列中元素
		System.out.println();

		System.out.println("去除队列中剩余的所有元素！ 进行中。。。"); // 输出
		Q.clear(); // 清除队列中的元素

		if (Q.isEmpty())// 队列空，输出
			System.out.println("队列已清空!");
	}

}
// 调试结果：
// 队列中各元素为(队首到队尾)：
// 1 2 3 4 5 6 7 8 9 10
// 队列非空！
// 队列的长度为： 10
// 队首元素为： 1
// 去除队首元素后，队列中各元素为(队首到队尾)：
// 2 3 4 5 6 7 8 9 10
// 去除队列中剩余的所有元素！ 进行中。。。
// 队列已清空!
