import java.util.Scanner;

public class InteractiveShell {
	static {
		System.out.println("Last login: Sun Jan 10 12:08:50 on console \n ");
	}

	static Scanner input = new Scanner(System.in);

	static Engine engine = new Engine();

	public void shell() {
		System.out.print("(base) keremeylem@Kerem-MacBook-Pro ~ % ");
		String zsh = input.nextLine();
		int id;

		if (zsh.equalsIgnoreCase("new student")) {
			System.out.print("Name: ");
			zsh = input.nextLine();

			engine.newStudent(zsh);

		} else if (zsh.equalsIgnoreCase("find student")) {
			System.out.println("With id / name?");
			zsh = input.nextLine();
			if (zsh.equalsIgnoreCase("id")) {
				System.out.print("Number: ");
				id = input.nextInt();
				engine.findStudent(id);
			} else {
				System.out.print("Name: ");
				zsh = input.nextLine();
				engine.findStudent(zsh);

			}
			engine.findStudent(zsh);
		} else if (zsh.equalsIgnoreCase("remove student")) {
			System.out.println("With id / name?");
			zsh = input.nextLine();
			if (zsh.equalsIgnoreCase("id")) {
				System.out.print("Number: ");
				id = input.nextInt();
				engine.removeStudent(id);
			} else {
				System.out.print("Name: ");
				zsh = input.nextLine();
				engine.removeStudent(zsh);

			}

		} else if (zsh.equalsIgnoreCase("print all")) {
			engine.printAll();
		}

		else {
			System.out.println("Invalid input");
		}

	}
}
