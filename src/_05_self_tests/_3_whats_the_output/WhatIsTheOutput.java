package _05_self_tests._3_whats_the_output;

public class WhatIsTheOutput {
	
		public static void main(String[] args){
			String num = "";
			for(int i = 5; i >= 0; i--){
				num += "count" + i + " ";
			}
			System.out.println(num);
		}
	}


