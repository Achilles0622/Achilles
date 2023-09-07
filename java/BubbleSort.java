public class BubbleSort{
	public static void main(String[]args) {
		int[]arr= {24,69,80,57,13};
		
		int temp=0;
		for(int i=0;i<4;i++) {//外层循环四次
			
		}
		for(int j=0;j<4;j++) {
		if(arr[j]>arr[j+1]) {
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			}
		}
		System.out.println("----第一轮-----");
		for(int j =0;j<arr.length;j++) {
			System.out.print(arr[j]);
			}
		for(int j=0;j<3;j++) {
		if(arr[j]>arr[j+1]) {
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			}
		}
		System.out.println("----第2轮-----");
		for(int j =0;j<arr.length;j++) {
			System.out.print(arr[j]);
	}
		for(int j=0;j<2;j++) {
		if(arr[j]>arr[j+1]) {
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			}
		}
		System.out.println("----第3轮-----");
		for(int j =0;j<arr.length;j++) {
			System.out.print(arr[j]);
		}
		for(int j=0;j<1;j++) {
		if(arr[j]>arr[j+1]) {
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			}
		}
		System.out.println("----第4轮-----");
		for(int j =0;j<arr.length;j++) {
			System.out.print(arr[j]);
		}
	}
}