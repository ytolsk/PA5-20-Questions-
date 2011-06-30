package edu.brandeis.quest;

import java.util.Hashtable;
import java.util.Scanner;

public class JQuestions {
	static Hashtable<String,String> yes = new Hashtable<String,String>();
	static Hashtable<String,String> no = new Hashtable<String,String>();
	
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("Is it an animal?");
		String ans = scan.next();
		if (ans == "yes"){
			System.out.println("What is it?");
			yes.put("Is it an annimal?", scan.next());
		}
		else if (ans == "no"){
			System.out.println("What is a question about it?");
			String q = scan.next();
			no.put("Is it an annimal?", q );
			System.out.println("What is it");
			yes.put(q, scan.next());
		}
		else {
			System.out.println("Answer has to be yes or no!");
		}
		String quest = "Is it an animal?";
		while(true){
			System.out.println(quest);
			String answer = scan.next();
			if(answer == "yes"){
				if(yes.get(quest) != null){
					System.out.println("Is it a "+ yes.get(quest) );
					if(scan.next()== "yes"){
						System.out.println("I win!");
						break;
					}
					else{
						System.out.println("What is a question about it?");
						String q = scan.next();
						no.put("Is it an annimal?", q );
						System.out.println("What is it");
						yes.put(q, scan.next());
						
					}
				}
			}
			
		}
	}
	
	

}
