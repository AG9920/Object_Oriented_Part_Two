package com.futuregong.crazy_Java;

interface Product{
	int getProduceTime();
}
public class Printer implements Output,Product{
	//MAX_CACHE_LINEԴ�Խӿ�Output
	private String[] printData = new String[MAX_CACHE_LINE];
	//���Լ�¼��ǰ���ӡ����ҵ��
	private int dataNum = 0 ;
	public int getProduceTime() {
		// TODO Auto-generated method stub
		return 45;
	}

	public void out() {
		// TODO Auto-generated method stub
		//ֻҪ������ҵ���ͼ�����ӡ
		while(dataNum>0){
			System.out.println("��ӡ����ӡ"+printData[0]);
			//����ҵ��������ǰ��һλ������ʣ�µ���ҵ����1
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}

	public void getData(String msg) {
		// TODO Auto-generated method stub
		if(dataNum>=MAX_CACHE_LINE){
			System.out.println("����������������ʧ��");
		}
		else{
			//�Ѵ�ӡ������ӵ�������ѱ������ݵ�����+1
			printData[dataNum++] = msg;
		}
	}
	public static void main(String[] args) {
		//����һ��Printer���󣬵���Outputʹ��
		Output o = new Printer();
		o.getData("��ѧ�Ĺ���");
		o.getData("ɯʿ����");
		o.out();
		o.getData("���˴�");
		o.getData("Ruby");
		o.out();
		//����һ��Printer���󣬵���Productʹ��
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		//���нӿ����͵����ñ����Ǹ�����ֱ�Ӹ���Object���͵ı���
		Object obj = p;
	}
}
