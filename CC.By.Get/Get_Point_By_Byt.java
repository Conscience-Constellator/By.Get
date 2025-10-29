package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Byt$Point;

public interface Get_Point_By_Byt<Valu_Typ> extends
	Get_Q_By_Byt,
	Get_Point_By_Q<Valu_Typ>,
	Byt$Point<Valu_Typ>
{
	@Lin_Dclar
	Valu_Typ Get_Point_By_Byt(byte By);
		@Override @Nevr_Neds_Ovrid
		default Valu_Typ Byt$Point(byte In)
		{return Get_Point_By_Byt(In);}
}