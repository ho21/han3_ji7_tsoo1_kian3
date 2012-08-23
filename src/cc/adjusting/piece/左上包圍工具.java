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
		左上接合模組 模組=new 左上接合模組(調整工具);
		二元搜尋貼合工具 貼合工具=new 二元搜尋貼合工具(模組);
		貼合工具.執行(物件活字);

		RectangularArea[] 調整結果=模組.取得調整後活字物件();
		物件活字.getPiece().reset();
		物件活字.getPiece().add(調整結果[0]);
		物件活字.getPiece().add(調整結果[1]);
		return;
	}
}
