package com.jodu.www;

interface Stack {
	abstract public int length(); //abstract public�� ������ �����ϴ�!
	abstract public Object pop();
	abstract public boolean push(Object ob);
}

class StringStack implements Stack {
	private String[] str;
	private int index;
	public StringStack(int a) {
		str = new String[a];
		index = 0;
	}
	@Override
	public int length() {
		return str.length;
	}
	@Override
	public Object pop() {
		if(index == 0) //������ �����
			return null;
		index--;
		return str[index];
	}
	@Override
	public boolean push(Object ob) {
		if(index == str.length)
			return false;
		str[index++] = (String)ob;
		return true;
	}
	public static void main(String[] args) {
		Stack s = new StringStack(10);
		for(int i=0; i<s.length(); i++)
			s.push("���ڿ�" + i);
		for(int i=0; i<s.length(); i++)
			System.out.println(s.pop());
	}
}
