package SoftUni.fundamentalsJanuary.finalExam.preparation;

import java.util.*;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPieces = Integer.parseInt(scanner.nextLine());

        List<Piece> pieces = new ArrayList<>();

        for (int i = 0; i < numberOfPieces; i++) {
            String[] pieceDetails = scanner.nextLine().split("\\|");

            String piece = pieceDetails[0];
            String composer = pieceDetails[1];
            String key = pieceDetails[2];

            pieces.add(new Piece(piece, composer, key));
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] inputCommands = input.split("\\|");

            switch (inputCommands[0]) {
                case "Add": {
                    String piece = inputCommands[1];
                    String composer = inputCommands[2];
                    String key = inputCommands[3];

                    if (isPieceExist(pieces, piece)) {
                        System.out.printf("%s is already in the collection!%n", piece);
                    } else {
                        pieces.add(new Piece(piece, composer, key));
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    }
                    break;
                }

                case "Remove": {
                    String piece = inputCommands[1];
                    if (isPieceExist(pieces, piece)) {
                        removePiece(pieces, piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                }
                case "ChangeKey": {
                    String piece = inputCommands[1];
                    String newKey = inputCommands[2];

                    if (isPieceExist(pieces, piece)) {
                        changePieceKey(pieces, piece, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                }
            }

            input = scanner.nextLine();
        }

        for (Piece piece : pieces) {
            System.out.println(piece);
        }
    }

    private static void changePieceKey(List<Piece> pieces, String piece, String newKey) {
        pieces.stream().filter(p -> p.getPiece().equals(piece)).forEach(p -> p.setKey(newKey));
    }

    private static void removePiece(List<Piece> pieces, String pieceToRemove) {
        pieces.removeIf(piece -> piece.getPiece().equals(pieceToRemove));
    }

    private static boolean isPieceExist(List<Piece> pieces, String newPiece) {
        for (Piece piece : pieces) {
            if (piece.getPiece().equals(newPiece)) {
                return true;
            }
        }
        return false;
    }

    static class Piece {

        private String piece;
        private String composer;

        public void setKey(String key) {
            this.key = key;
        }

        private String key;

        public String getPiece() {
            return piece;
        }

        public String getComposer() {
            return composer;
        }

        public String getKey() {
            return key;
        }

        public Piece(String piece, String composer, String key) {
            this.piece = piece;
            this.composer = composer;
            this.key = key;
        }

        @Override
        public String toString() {
            return String.format("%s -> Composer: %s, Key: %s", this.piece, this.composer, this.key);
        }

    }
}
