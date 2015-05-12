using System;
using System.Collections;
using System.Collections.Generic;
using System.Data;
using System.Drawing;
using System.Diagnostics;
using System.Windows.Forms;

public partial class Form1
{
	private ChessBoard cb = new ChessBoard();
    private int i = 0;

    public Form1()
    {
        InitializeComponent();
    }

	private void Form1_Load(object sender, System.EventArgs e)
	{
		cb.Dock = DockStyle.Fill;
        lblHamle.Visible = false;
	}


    private void btnCreate_Click(object sender, EventArgs e)
    {
        cb.GetSolutions();
        Panel1.Controls.Add(cb);
        cb.Cells = cb.Solutions[0];
        cb.DrawBoard();
    }

    private void btnTest_Click(object sender, EventArgs e)
    {
        MessageBox.Show("Olasý Hamle Sayýsý: " + cb.Solutions.Count + " Olasý Tehdit Sayýsý: " + cb.TehditSayisi);
    }

    private void btnPlay_Click(object sender, EventArgs e)
    {
        lblHamle.Visible = true;
        timer1.Start();
    }

    private void timer1_Tick(object sender, EventArgs e)
    {
        if (i == cb.Solutions.Count)
        {
            i = 0;
            timer1.Stop();
            return;
        }

        lblHamle.Text = "Hamle Sayýsý: " + (i + 1);

        cb.Cells = cb.Solutions[i++];
        cb.DrawBoard();

    }
}