import React, { useRef } from 'react';
import './style.css';
import { useBoardStore } from 'stores';

//          component: 게시물 작성 화면          //
export default function BoardWrite() {

  //          state: 이미지 인풋 ref 상태          //
  const imageInputRef = useRef<HTMLInputElement | null>(null);
  //          state: 게시물 상태          //
  const { title, setTitle } = useBoardStore();
  const { contents, setContents } = useBoardStore();
  const { image, setImage } = useBoardStore();

  //          event handler: 이미지 업로드 버튼 클릭 이벤트 처리          //
  const onImageUploadButtonClickHandler = () => {
    if (!imageInputRef.current) return;
    imageInputRef.current.click();
  }

  //          render: 게시물 작성 화면 렌더링          //
  return (
    <div id='board-write-wrapper'>
      <div className='board-write-container'>
        <div className='board-write-box'>
          <div className='board-write-title-box'>
            <input className='board-write-title-input' type='text' placeholder='제목을 작성해주세요.' />
          </div>
          <div className='divider'></div>
          <div className='board-write-contents-box'>
            <textarea className='board-write-contents-textarea' placeholder='본문을 작성해주세요.' />
            <input ref={imageInputRef} type='file' accept='image/*' style={{ display: 'none' }} />
            <div className='icon-button' onClick={onImageUploadButtonClickHandler}>
              <div className='image-box-light-icon'></div>
            </div>
          </div>
          <div className='board-write-images-box'>
            <div className='board-write-image-box'>
              <img className='board-write-image' />
              <div className='icon-button image-close'>
                <div className='close-icon'></div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  )
}
