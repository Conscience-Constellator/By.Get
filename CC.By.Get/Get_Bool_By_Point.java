package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Point$Bool;

public interface Get_Bool_By_Point<By_Typ> extends
	Get_Bool_By_Q,
	Get_Q_By_Point<By_Typ>,
	Point$Bool<By_Typ>
{
	@Lin_Dclar
	boolean Get_Bool_By_Point(By_Typ By);
		@Override @Nevr_Neds_Ovrid
		default boolean Point$Bool(By_Typ In)
		{return Get_Bool_By_Point(In);}
}