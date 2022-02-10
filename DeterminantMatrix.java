public class DeterminantMatrix {

    public static void main(String[] args) {

// - determinant of any matrix by the Gauss method
            double matrix[][] = {
                    {5, 3, 1, 2},
                    {3, 3, 3, 2},
                    {3, 2, 4, 5},
                    {5, 2, 2, 7}
            };

            int count = 0;
            double determinant = 1;
            int matrixIndex = 0;
            int parity = 0;


            for (int line = 0; line < matrix.length; line++) {
                double max = matrix[line][line];
                for (int i = line; i < matrix.length; i++) {
                    if (max < matrix[i][line]) {
                        count = i;
                        max = matrix[i][line];
                    }
                }
                if (count > 0) {
                    for (int i = 0; i < matrix.length; i++) {
                        double temp = matrix[count][i];
                        matrix[count][i] = matrix[line][i];
                        matrix[line][i] = temp;
                        parity++;
                    }
                    count = 0;
                }
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(" " + matrix[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();

                for (int i = 1 + line; i < matrix.length; i++) {
                    double index = matrix[i][line] / matrix[line][line];
                    for (int j = line; j < matrix[i].length; j++) {
                        matrix[i][j] = -(index) * matrix[line][j] + matrix[i][j];
                    }
                }
            }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(" " + matrix[i][j]);
                }
                System.out.println();
            }

            for (int i = 0; i < matrix.length; i++) {
                determinant = determinant * matrix[i][matrixIndex];
                matrixIndex++;
            }
            if (parity % 2 == 0 && parity != 0) {
                determinant = determinant * (-1);
            }
            System.out.println();
            System.out.println( "Детерминант матрицы = " + determinant);
        }
    }
