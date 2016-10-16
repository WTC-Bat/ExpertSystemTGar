
import java.util.Arrays;
public class Sum {
	int arrNum[] = new int[26];
	boolean[] array = new boolean[26];
	boolean answer = true;
	
	public void arrFill(){
		Arrays.fill(arrNum, -1);
	}
	public void print(){
		for(int i = 0; i < arrNum.length; i++){
		//System.out.println("arrTest ["+i+"]="+arrNum[i]);
		System.out.println("Test2 Data at ["+i+"]="+ array[i]);
		}
	}
	
	public void seperate(String ArgA){
		String arra = ArgA.toLowerCase();
		String temp = arra;
		String temp2 = arra;
		temp = temp.replaceAll("=(.*)", "");
		temp = temp.replaceAll("<(.*)", "");
		temp2 = temp2.replaceAll("(.*)>", "");
		checker(temp);
		checkerAnswer(temp2);
	}
	public void checker(String Arg){
		char arr[] = Arg.toCharArray();
		for (int i = 0; i < arr.length; i++){
			if (arr[i] == '+' || arr[i] == '|' || arr[i] == '!' || arr[i] == '^'){
				solve(arr);
			}
			else{
				array[forceRep(arr[i])] = array[forceRep(arr[i])];
			}
		}
	}
	public void checkerAnswer(String Arg){
		char arr[] = Arg.toCharArray();
		for (int i=0; i < arr.length; i++){
			if (arr[i] == '=' || arr[i] == '?'){
				return ;
			}
			if (arr[i] == '+'){
				array[forceRep(arr[i - 1])] = this.answer;
				array[forceRep(arr[i + 1])] = this.answer;
			}
			if (arr[i] == '|'){
				array[forceRep(arr[i - 1])] = this.answer;
				array[forceRep(arr[i + 1])] = !this.answer;
			}
			if (arr[i] == '^'){
				System.out.println("Error statement: fact removed");
			}
			if (arr[i] == '!'){
				array[forceRep(arr[i + 1])] = !this.answer;
			}
			else{
				array[forceRep(arr[i])] = this.answer;
			}
		}
	}
	
	public int forceRep(char arr){
			
		int n = 0;
		switch(arr){
			case 'a':
				arrNum[0] = 0;
				n = 0;
				break;
			case 'b':
				arrNum[1] = 1;
				n = 1;
				break;
			case 'c':
				arrNum[2] = 2;
				n = 2;
				break;
			case 'd':
				arrNum[3] = 3;
				n = 3;
				break;
			case 'e':
				arrNum[4] = 4;
				n = 4;
				break;
			case 'f':
				arrNum[5] = 5;
				n = 5;
				break;
			case 'g':
				arrNum[6] = 6;
				n = 6;
				break;
			case 'h':
				arrNum[7] = 7;
				n =7;
				break;
			case 'i':
				arrNum[8] = 8;
				n = 8;
				break;
			case 'j':
				arrNum[9] = 9;
				 n = 9;
				break;
			case 'k':
				arrNum[10] = 10;
				n = 10;
				break;
			case 'l':
				arrNum[11] = 11;
				n = 11;
				break;
			case 'm':
				arrNum[12] = 12;
				n = 12;
				break;
			case 'n':
				arrNum[13] = 13;
				n = 13;
				break;
			case 'o':
				arrNum[14] = 14;
				n = 14;
				break;
			case 'p':
				arrNum[15] = 15;
				n = 15;
				break;
			case 'q':
				arrNum[16] = 16;
				n = 16;
				break;
			case 'r':
				arrNum[17] = 17;
				 n = 17;
				break;
			case 's':
				arrNum[18] = 18;
				n = 18;
				break;
			case 't':
				arrNum[19] = 19;
				n = 19;
				break;
			case 'u':
				arrNum[20] = 20;
				 n = 20;
				break;
			case 'v':
				arrNum[21] = 21;
				 n = 21;
				break;
			case 'w':
				arrNum[22] = 22;
				n = 22;
				break;
			case 'x':
				arrNum[23] = 23;
				 n = 23;
				break;
			case 'y':
				arrNum[24] = 24;
				 n = 24;
				break;
			case 'z':
				arrNum[25] = 25;
				 n = 25;
				break;
			default:
				break;
			}
			return (n);
	}
	public void firtPass(String ArgA){
		String arra = ArgA.toLowerCase();
		char arr[]=arra.toCharArray();
		for(int i=0;i <arr.length;i++){
			if (arr[i] == '=' && i == 0)
			{
				firstrule(arr);
			}
		}
	}
	
	public void firstQuestion(String ArgA){
		String arra = ArgA.toLowerCase();
		char arr[]=arra.toCharArray();
		for(int i=0;i <arr.length;i++){
		if (arr[0] == '?' && i == 0)
		{
			question(arr);
		}
		}
		
	}
	public void firstrule(char test[]){
		for(int r=1; r < test.length; r++)
		{
			switch(test[r]){
			case 'a':
				this.array[0] = true;
				break;
			case 'b':
				this.array[1] = true;
				break;
			case 'c':
				this.array[2] = true;
				break;
			case 'd':
				this.array[3] = true;
				break;
			case 'e':
				this.array[4] = true;
				break;
			case 'f':
				this.array[5] = true;
				break;
			case 'g':
				this.array[6] = true;
				break;
			case 'h':
				this.array[7] = true;
				break;
			case 'i':
				this.array[8] = true;
				break;
			case 'j':
				this.array[9] = true;
				break;
			case 'k':
				this.array[10] = true;
				break;
			case 'l':
				this.array[11] = true;
				break;
			case 'm':
				this.array[12] = true;
				break;
			case 'n':
				this.array[13] = true;
				break;
			case 'o':
				this.array[14] = true;
				break;
			case 'p':
				this.array[15] = true;
				break;
			case 'q':
				this.array[16] = true;
				break;
			case 'r':
				this.array[17] = true;
				break;
			case 's':
				this.array[18] = true;
				break;
			case 't':
				this.array[19] = true;
				break;
			case 'u':
				this.array[20] = true;
				break;
			case 'v':
				this.array[21] = true;
				break;
			case 'w':
				this.array[22] = true;
				break;
			case 'x':
				this.array[23] = true;
				break;
			case 'y':
				this.array[24] = true;
				break;
			case 'z':
				this.array[25] = true;
				break;
			default:
				System.out.println("error");
				break;
			}
		}
	}
	public void question(char test[]){
		for(int r=1; r < test.length; r++)
		{
			System.out.println(test[r] +" = "+ array[forceRep(test[r])]);
		}
	}
	public void solve(char arr[]){
		for (int i = 0; i < arr.length; i++){
			if (arr[i] == '+'){
				this.answer = array[forceRep(arr[i - 1])] & array[forceRep(arr[i + 1])];		
			}
			else if (arr[i] == '|'){
				this.answer = array[forceRep(arr[i - 1])] | array[forceRep(arr[i + 1])];
			}
			else if (arr[i] == '^'){
				this.answer = (array[forceRep(arr[i - 1])] ^ array[forceRep(arr[i + 1])]);
			}
			else if (arr[i] == '!'){
				this.answer = !array[forceRep(arr[i + 1])];
			}
		
	}
	
	}	
}
