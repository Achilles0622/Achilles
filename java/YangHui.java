public class YangHui{
	public static void main (String[]args) {
		int[][]YangHui=new int[10][];
		for(int i =0;i<YangHui.length;i++) {
			//给每个1维数组开辟空间
			YangHui[i]=new int[i+1];//给每个一维数组赋值
			 for(int j =0;j<YangHui[i].length;j++) {
				 if(j==0||j==YangHui[i].length-1) {
					 YangHui[i][j]=1;
				 }else{
					 YangHui[i][j]=YangHui[i-1][j]+YangHui[i-1][j-1];
				 }
			 }
		}
		for(int i =0;i<YangHui.length;i++) {
			for(int j =0;j<YangHui[i].length;j++) {
				System.out.println(YangHui[i][j]+"\t");
			}
		}

	}
}