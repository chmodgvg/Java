	@Test
	public void isProbablePrime() {
		System.out.print("请输入一个数：");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int count = 0;
		for (int b = 1; b <= a; b++) {
			int c = a % b;
			if (c == 0) {
				count++;
			}
		}
		if (a == 1 || count == 2) {
			System.out.println(a + "是质数");
		} else {
			System.out.println(a + "不是质数");
		}
	}
