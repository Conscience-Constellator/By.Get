package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Bool$ChR;

public interface Get_ChR_By_Bool extends
	Get_Q_By_Bool,
	Get_ChR_By_Q,
	Bool$ChR
{
	@Lin_Dclar
	char Get_ChR_By_Bool(boolean By);
		@Override @Nevr_Neds_Ovrid
		default char Bool$ChR(boolean In)
		{return Get_ChR_By_Bool(In);}
}