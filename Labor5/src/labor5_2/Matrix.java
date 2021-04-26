package labor5_2;

public class Matrix {
    private double data[][];
    private int rows;
    private int columns;

    public Matrix(int rowNr, int columnNr)
    {
        this.rows=rowNr;
        this.columns=columnNr;
        data=new double[rowNr][columnNr];
    }

    public Matrix(double m2[][])
    {
        this.data=new double[m2.length][m2[0].length];
        this.rows=m2.length;
        this.columns=m2[0].length;
        for (int i=0;i<m2.length;i++)
        {
            for (int j=0;j<m2[0].length;j++)
            {
                data[i][j]=m2[i][j];
            }
        }
    }

    public Matrix(Matrix m)
    {
        this.rows=m.getRows();
        this.columns=m.getColumns();
        data=new double[m.getRows()][m.getColumns()];
        for (int i=0;i<m.getRows();i++)
        {
            for (int j=0;j<getColumns();j++)
            {
                data[i][j]=m.data[i][j];
            }
        }
    }

    public int getRows() {
        return rows;
    }
    public int getColumns() {
        return columns;
    }

    public void printMatrix()
    {
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                System.out.print(data[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public void fillRandom(double min, double max)
    {
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                data[i][j]=((Math.random() * (max - min)) + min);
            }
        }
    }

    public static Matrix add(Matrix m1, Matrix m2) throws MatrixException
    {
        if (m1.getRows()!=m2.getRows()||m1.getColumns()!=m2.getColumns())
        {
            throw new MatrixException("NOT EQUAL SIZED MATRIXES!\n");
        }
        Matrix res=new Matrix(m1.getRows(), m1.getColumns());
        for (int i=0;i<res.getRows();i++)
        {
            for (int j=0;j<res.getColumns();j++)
            {
                res.data[i][j]=m1.data[i][j]+m2.data[i][j];
            }
        }
        return res;
    }

    public static Matrix transpose(Matrix m)
    {
        Matrix res=new Matrix(m.getColumns(), m.getRows());
        {
            for (int j=0;j<m.getColumns();j++)
            {
                for (int i=0;i<m.getRows();i++)
                {
                    res.data[j][i]=m.data[i][j];
                }
            }
        }
        return res;
    }

    public static Matrix multiply(Matrix m1, Matrix m2) throws MatrixException
    {
        if (m1.getColumns()!=m2.getRows())
        {
            throw new MatrixException("Not adequate matrix sizes!\n");
        }
        Matrix res= new Matrix(m1.getRows(), m2.getColumns());
        for (int i = 0; i < m1.data.length; i++)
        {
            for (int j = 0; j < m2.data[0].length; j++)
            {
                for (int k = 0; k < m1.data[0].length; k++)
                {
                    res.data[i][j] += m1.data[i][k] * m2.data[k][j];
                }
            }
        }
        return res;
    }
}
