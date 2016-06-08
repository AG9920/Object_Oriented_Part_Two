package com.futuregong.crazy_Java;

interface Product{
	int getProduceTime();
}
public class Printer implements Output,Product{
	//MAX_CACHE_LINE源自接口Output
	private String[] printData = new String[MAX_CACHE_LINE];
	//用以记录当前需打印的作业数
	private int dataNum = 0 ;
	public int getProduceTime() {
		// TODO Auto-generated method stub
		return 45;
	}

	public void out() {
		// TODO Auto-generated method stub
		//只要还有作业，就继续打印
		while(dataNum>0){
			System.out.println("打印机打印"+printData[0]);
			//把作业队列整体前移一位，并将剩下的作业数减1
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}

	public void getData(String msg) {
		// TODO Auto-generated method stub
		if(dataNum>=MAX_CACHE_LINE){
			System.out.println("输出队列已满，添加失败");
		}
		else{
			//把打印数据添加到队列里，已保存数据的数量+1
			printData[dataNum++] = msg;
		}
	}
	public static void main(String[] args) {
		//创建一个Printer对象，当成Output使用
		Output o = new Printer();
		o.getData("哲学的故事");
		o.getData("莎士比亚");
		o.out();
		o.getData("名人传");
		o.getData("Ruby");
		o.out();
		//创建一个Printer对象，当成Product使用
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		//所有接口类型的引用宾来那个都可直接赋给Object类型的变量
		Object obj = p;
	}
}
