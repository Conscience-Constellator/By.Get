package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Bool$Flot;

public interface Get_Flot_By_Bool extends
	Get_Q_By_Bool,
	Get_Flot_By_Q,
	Bool$Flot
{
	@Lin_Dclar
	float Get_Flot_By_Bool(boolean By);
		@Override @Nevr_Neds_Ovrid
		default float Bool$Flot(boolean In)
		{return Get_Flot_By_Bool(In);}
}