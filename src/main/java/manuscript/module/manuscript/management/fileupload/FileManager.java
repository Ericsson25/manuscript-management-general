package manuscript.module.manuscript.management.fileupload;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

public interface FileManager {

	/**
	 * A megadott param�terek szerint l�trehoz egy unique f�jl nevet, �s visszat�r mag�val a f�jllal. Ha az {@linkplain existingFilePath} nem null,
	 * akkor a rendszer a l�tez� f�jln�vb�l gener�l egy �j sequence-t.
	 * 
	 * @param file
	 * @param existingFilePath
	 * @return File path
	 */
	public File saveFile(MultipartFile file, String existingFilePath);

	/**
	 * Kit�rli a f�jlt, ha megtal�lja a megadott �tvonalon.
	 * 
	 * @param file
	 */
	public void deleteFile(File file);

}
