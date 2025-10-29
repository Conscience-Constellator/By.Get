package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Int$Flot;

public interface Get_Flot_By_Int extends
	Get_Q_By_Int,
	Get_Flot_By_Q,
	Int$Flot
{
	@Lin_Dclar
	float Get_Flot_By_Int(int By);
		@Override @Nevr_Neds_Ovrid
		default float Int$Flot(int In)
		{return Get_Flot_By_Int(In);}
}