package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Int$ChR;

public interface Get_ChR_By_Int extends
	Get_Q_By_Int,
	Get_ChR_By_Q,
	Int$ChR
{
	@Lin_Dclar
	char Get_ChR_By_Int(int By);
		@Override @Nevr_Neds_Ovrid
		default char Int$ChR(int In)
		{return Get_ChR_By_Int(In);}
}