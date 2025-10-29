package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Short$Flot;

public interface Get_Flot_By_Short extends
	Get_Q_By_Short,
	Get_Flot_By_Q,
	Short$Flot
{
	@Lin_Dclar
	float Get_Flot_By_Short(short By);
		@Override @Nevr_Neds_Ovrid
		default float Short$Flot(short In)
		{return Get_Flot_By_Short(In);}
}