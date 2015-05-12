using System;
using System.Collections.Generic;
using System.Text;
using System.Windows.Forms;

public static class MyApplication
{
    /// <summary>
    /// The main entry point for the application.
    /// </summary>
    [STAThread]
    static void Main()
    {
        Application.EnableVisualStyles();
        Application.SetCompatibleTextRenderingDefault(false);
        Application.Run(new Form1());
    }

    /*
        Backtracking Algorithm
        The idea is to place queens one by one in different columns, starting from the leftmost column. When we place a queen in a column, we check for clashes with already placed queens. In the current column, if we find a row for which there is no clash, we mark this row and column as part of the solution. If we do not find such a row due to clashes then we backtrack and return false.

        1) Start in the leftmost column
        2) If all queens are placed
            return true
        3) Try all rows in the current column.  Do following for every tried row.
            a) If the queen can be placed safely in this row then mark this [row, 
                column] as part of the solution and recursively check if placing  
                queen here leads to a solution.
            b) If placing queen in [row, column] leads to a solution then return 
                true.
            c) If placing queen doesn't lead to a solution then umark this [row, 
                column] (Backtrack) and go to step (a) to try other rows.
        3) If all rows have been tried and nothing worked, return false to trigger 
            backtracking.
     */
}
