package javaintprep;

public class Pattern {

	public static void main(String [] args) {
		int n = 5;
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n;j++) {
			System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("____________________________________________________________________________________________________________________________");
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println("____________________________________________________________________________________________________________________________");
		
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("____________________________________________________________________________________________________________________________");
		
		
		for(int i=n; i>=1;i--) {
			for(int j=1;j<=i;j++) {
			System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("____________________________________________________________________________________________________________________________");
		
		for(int i=1; i<=n;i++) {
			for(int j=i;j<=n;j++) {
			System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("____________________________________________________________________________________________________________________________");
		
		
		
		for(int i=1; i<=n;i++) {
			
			for(int j=i;j<=n;j++) {
			System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
				}
			
			
			
			System.out.println();
		}
		
		System.out.println("____________________________________________________________________________________________________________________________");
		
      for(int i=1; i<=n;i++) {
			
    	  for(int j=1;j<=i;j++) {
  			System.out.print("  ");
  			}
			for(int j=i;j<=n;j++) {
				System.out.print(" *");
				}
			
			
			
			System.out.println();
		}
		
		System.out.println("____________________________________________________________________________________________________________________________");
		
		

		for(int i=1; i<=n;i++) {
			
			for(int j=i;j<=n;j++) {
			System.out.print("  ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(" *");
				}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
				}
			
			
			
			System.out.println();
		}
		
		System.out.println("____________________________________________________________________________________________________________________________");
		 for(int i=1; i<=n;i++) {
				
	    	  for(int j=1;j<=i;j++) {
	  			System.out.print("  ");
	  			}
				for(int j=i;j<n;j++) {
					System.out.print(" *");
					}
				for(int j=i;j<=n;j++) {
					System.out.print(" *");
					}
				
				
				
				System.out.println();
			}
			
			System.out.println("____________________________________________________________________________________________________________________________");
			

			for(int i=1; i<n;i++) {
				
				for(int j=i;j<=n;j++) {
				System.out.print("  ");
				}
				for(int j=1;j<i;j++) {
					System.out.print(" *");
					}
				for(int j=1;j<=i;j++) {
					System.out.print(" *");
					}
				
				
				
				System.out.println();
			}
	
			 for(int i=1; i<=n;i++) {
					
		    	  for(int j=1;j<=i;j++) {
		  			System.out.print("  ");
		  			}
					for(int j=i;j<n;j++) {
						System.out.print(" *");
						}
					for(int j=i;j<=n;j++) {
						System.out.print(" *");
						}
					
					
					
					System.out.println();
				}
				
				System.out.println("____________________________________________________________________________________________________________________________");
			
		
		
	}
}
