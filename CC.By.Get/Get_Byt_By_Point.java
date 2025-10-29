package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Point$Byt;

public interface Get_Byt_By_Point<By_Typ> extends
	Get_Q_By_Point<By_Typ>,
	Get_Byt_By_Q,
	Point$Byt<By_Typ>
{
	@Lin_Dclar
	byte Get_Byt_By_Point(By_Typ By);
		@Override @Nevr_Neds_Ovrid
		default byte Point$Byt(By_Typ In)
		{return Get_Byt_By_Point(In);}
}