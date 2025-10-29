package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Dubl$Bool;

public interface Get_Bool_By_Dubl extends
	Get_Bool_By_Q,
	Get_Q_By_Dubl,
	Dubl$Bool
{
	@Lin_Dclar
	boolean Get_Bool_By_Dubl(double By);
		@Override @Nevr_Neds_Ovrid
		default boolean Dubl$Bool(double In)
		{return Get_Bool_By_Dubl(In);}
}