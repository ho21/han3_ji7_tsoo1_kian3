package cc.adjusting.piece;

import cc.moveable_type.piece.PieceMovableTypeTzu;
import cc.moveable_type.rectangular_area.RectangularArea;

/**
 * 用於左上的包圍部件。從左上方包住，像是「厂」、「广」、「尸」和「『左』的左上方」等等。
 * 
 * @author Ihc
 */
public class 左上包圍工具 extends 物件活字包圍工具
{
	/**
	 * 建立左上包圍工具
	 * 
	 * @param 調整工具
	 *            使用此包圍工具的調整工具，並使用其自身合併相關函式
	 */
	public 左上包圍工具(MergePieceAdjuster 調整工具)
	{
		super(調整工具);
		支援包圍部件.add("厂");
		支援包圍部件.add("广");
		支援包圍部件.add("疒");
		支援包圍部件.add("尸");
		支援包圍部件.add("戶");
		支援包圍部件.add("户");
		支援包圍部件.add("虍");
		// TODO　/*歷廈病居房灰老名虐遞…*/
	}

	@Override
	public void 組合(PieceMovableTypeTzu 物件活字)
	{
		左上接合模組 模組 = new 左上接合模組(調整工具);
		包圍調整工具 包圍調整工具=new 包圍調整工具(模組, 調整工具);
		包圍調整工具.組合(物件活字.取得活字物件());
		RectangularArea[] 調整結果 = 模組.取得調整後活字物件();
//		左上接合模組 模組 = new 左上接合模組(調整工具);
//		二元搜尋間隔工具 貼合工具 = new 二元搜尋間隔工具(模組);
//		貼合工具.執行(物件活字);
//
//		RectangularArea[] 調整結果 = 模組.取得調整後活字物件();
//		// System.out.println("a0="+調整結果[0].getBounds2D());
//		// System.out.println("a1="+調整結果[1].getBounds2D());
//		平推黏合模組 模組2 = new 上推黏合模組(調整工具);
//		二元搜尋間隔工具 貼合工具2 = new 二元搜尋間隔工具(模組2);
//		貼合工具2.執行(調整結果);
//		調整結果 = 模組2.取得調整後活字物件();
//
//		平推黏合模組 模組3 = new 下推黏合模組(調整工具);
//		二元搜尋間隔工具 貼合工具3 = new 二元搜尋間隔工具(模組3);
//		貼合工具3.執行(調整結果);
//		調整結果 = 模組3.取得調整後活字物件();
//
//		平推黏合模組 模組4 = new 左推黏合模組(調整工具);
//		二元搜尋間隔工具 貼合工具4 = new 二元搜尋間隔工具(模組4);
//		貼合工具4.執行(調整結果);
//		調整結果 = 模組4.取得調整後活字物件();
//		平推黏合模組 模組5 = new 右推黏合模組(調整工具);
//		二元搜尋間隔工具 貼合工具5 = new 二元搜尋間隔工具(模組5);
//		貼合工具5.執行(調整結果);
//		調整結果 = 模組5.取得調整後活字物件();
//
//		平推黏合模組 模組6 = new 上推黏合模組(調整工具);
//		二元搜尋貼合工具 貼合工具6 = new 二元搜尋微貼工具(模組6);
//		貼合工具6.執行(調整結果);
//		調整結果 = 模組6.取得調整後活字物件();
//		平推黏合模組 模組7 = new 下推黏合模組(調整工具);
//		二元搜尋貼合工具 貼合工具7 = new 二元搜尋微貼工具(模組7);
//		貼合工具7.執行(調整結果);
//		調整結果 = 模組7.取得調整後活字物件();
//		平推黏合模組 模組8 = new 左推黏合模組(調整工具);
//		二元搜尋貼合工具 貼合工具8 = new 二元搜尋微貼工具(模組8);
//		貼合工具8.執行(調整結果);
//		調整結果 = 模組8.取得調整後活字物件();
//		平推黏合模組 模組9 = new 右推黏合模組(調整工具);
//		二元搜尋貼合工具 貼合工具9 = new 二元搜尋微貼工具(模組9);
//		貼合工具9.執行(調整結果);
//		調整結果 = 模組9.取得調整後活字物件();
//		
//		左上接合模組 模組10 = new 左上接合模組(調整工具);
//		二元搜尋貼合工具 貼合工具10 = new 二元搜尋貼合工具(模組10);
//		貼合工具10.執行(調整結果);
//		調整結果 = 模組10.取得調整後活字物件();

		物件活字.getPiece().reset();
		物件活字.getPiece().add(調整結果[0]);
		物件活字.getPiece().add(調整結果[1]);
		return;
	}
}
