package manuscript.module.manuscript.management.fileupload;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

public interface FileManager {

	/**
	 * A megadott paraméterek szerint létrehoz egy unique fájl nevet, és visszatér magával a fájllal. Ha az {@linkplain existingFilePath} nem null,
	 * akkor a rendszer a létezõ fájlnévbõl generál egy új sequence-t.
	 * 
	 * @param file
	 * @param existingFilePath
	 * @return File path
	 */
	public File saveFile(MultipartFile file, String existingFilePath);

	/**
	 * Kitörli a fájlt, ha megtalálja a megadott útvonalon.
	 * 
	 * @param file
	 */
	public void deleteFile(File file);

}
