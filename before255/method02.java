package before255;

public   class method02{
	public static void main (String[]args) {
		int[][]map= {{0,0,1,},{1,1,1},{1,1,3,}};
		MyTools2 tool=new MyTools2();
		tool.printArr(map);
		tool.printArr(map);
		tool.printArr(map);
		tool.printArr(map);
		tool.printArr(map);
		//传统方法就是for循环直接遍历
	
		//要求再次遍历数组map
	}
}
class MyTools2{
	public void printArr(int[][]map) {
		for (int i =0;i<map.length;i++) {
			for(int j =0;j<map[i].length;j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
	}
}}