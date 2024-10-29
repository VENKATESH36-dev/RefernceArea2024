package test1;

public class BishopMovement {

	public static void main(String[] args) {

		int bishopX = 1, bishopY = 1; 
		int pieceX = 3, pieceY = 3; 

		String result = canReachPiece(pieceX, pieceY, bishopX, bishopY);
		System.out.println("canReachPiece:: " + result);

	}

	public static String canReachPiece(int bx, int by, int px, int py) {

		if ((bx + by) % 2 != (px + py) % 2) {
			return "NO"; 
		}

		if (Math.abs(bx - px) == Math.abs(by - py)) {
			return "YES\n1"; 
		}

		return "YES\n2"; 
	}

}
