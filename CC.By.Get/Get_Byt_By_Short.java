package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Short$Byt;

public interface Get_Byt_By_Short extends
	Get_Q_By_Short,
	Get_Byt_By_Q,
	Short$Byt
{
	@Lin_Dclar
	byte Get_Byt_By_Short(short By);
		@Override @Nevr_Neds_Ovrid
		default byte Short$Byt(short In)
		{return Get_Byt_By_Short(In);}
}