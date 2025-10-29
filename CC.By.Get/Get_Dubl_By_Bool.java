package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Bool$Dubl;

public interface Get_Dubl_By_Bool extends
	Get_Q_By_Bool,
	Get_Dubl_By_Q,
	Bool$Dubl
{
	@Lin_Dclar
	double Get_Dubl_By_Bool(boolean By);
		@Override @Nevr_Neds_Ovrid
		default double Bool$Dubl(boolean In)
		{return Get_Dubl_By_Bool(In);}
}